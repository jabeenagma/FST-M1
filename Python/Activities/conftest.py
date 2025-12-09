import pytest

@pytest.fixture
def input_value():
   input = 30
   return input

@pytest.fixture
def initialize_list():
    return [0,1, 2, 3, 4, 5,6,7,8,9,10]
