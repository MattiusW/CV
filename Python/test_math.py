import pytest
import my_math


def test_one_max_value():
  assert my_math.max(1.5, 5, 2) == 5


def test_two_max_value():
  assert my_math.max() == None


def test_three_max_value():
  with pytest.raises(ValueError):
    my_math.max("Andrzej")


def test_one_min_value():
  assert my_math.min(1, 3, 5) == 1


def test_two_min_value():
  assert my_math.min() == None


def test_three_min_value():
  with pytest.raises(ValueError):
    my_math.min("Stachu")


def test_one_zero():
  assert my_math.sign(0) == 0


def test_two_add():
  assert my_math.sign(1) <= 1


def test_three_sub():
  assert my_math.sign(-2) <= -1


def test_four_sign_value():
  with pytest.raises(ValueError):
    my_math.sign("Andrzej")


def test_one_avg():
  assert my_math.avg(2, 4, 3, 1) == 2.5


def test_two_avg():
  assert my_math.avg() == None


def test_three_avg():
  with pytest.raises(ValueError):
    my_math.avg("String")


def test_one_mediana():
  assert my_math.median(1, 2, 3, 4, 5, 6, 7) == 4


def test_two_mediana_empty_value():
  assert my_math.median() == None


def test_three_mediana_not_sort():
  assert my_math.median(1, 8, 6, 9, 5) == 6


def test_four_mediana_even():
  assert my_math.median(1, 2, 4, 5) == 3


def test_five_mediana_string():
  with pytest.raises(ValueError):
    my_math.median("Sprawdzanie")