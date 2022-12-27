using System.Collections;
using System.Collections.Generic;
using System.Runtime.CompilerServices;
using UnityEngine;
using UnityEngine.UIElements;

public class CameraController : MonoBehaviour
{
    //VARIABLES
    [SerializeField] private float mouseSensitivity;

    //REFERENCES
    private Transform parent;

    private void Start()
    {
        parent = transform.parent;
        UnityEngine.Cursor.lockState = CursorLockMode.Locked;
    }

    private void Update()
    {
        Rotate();
    }
    private void Rotate()
    {
        float mouseX = Input.GetAxis("Mouse X") * mouseSensitivity * Time.deltaTime;

        parent.Rotate(Vector3.up, mouseX);
    }


}
