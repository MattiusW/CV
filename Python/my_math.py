from typing import Optional
import pytest


def max(*args: int) -> Optional[int]:
  '''Returns maximum value or None if there are no arguments'''
  if len(args) == 0:
    return None

  max_el = args[0]
  for el in args:
    if not (isinstance(el, int) or isinstance(el, float)):
      raise ValueError()
    elif el > max_el:
      max_el = el
  return max_el


def min(*args: int) -> Optional[int]:
  if len(args) == 0:
    return None

  min_el = args[0]
  for el in args:
    if not (isinstance(el, int) or isinstance(el, float)):
      raise ValueError()
    elif el < min_el:
      min_el = el
  return min_el


def sign(val: int) -> Optional[int]:
  if not (isinstance(val, int) or isinstance(val, float)):
    raise ValueError()
  if val > 0:
    return 1
  elif val < 0:
    return -1
  return 0

  #raise NotImplementedError()


def avg(*args: int) -> Optional[int]:
  if len(args) == 0:
    return None

  for i in args:
    if not (isinstance(i, int) or isinstance(i, float)):
      raise ValueError()

  argumenty = 0
  wynik = 0
  for i in args:
    argumenty += i
  wynik = argumenty / len(args)
  return wynik


def median(*args: int) -> Optional[int]:
  if len(args) == 0:
    return None

  for i in args:
    if not (isinstance(i, int) or isinstance(i, float)):
      raise ValueError()

  tab = sorted(args)
  if len(tab) % 2 == 1:
    i = len(tab) // 2
    return tab[i]
  else:
    i1 = len(tab) // 2
    i2 = i1 - 1
    w1 = tab[i1]
    w2 = tab[i2]
    return (w1 + w2) // 2