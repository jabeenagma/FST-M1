
import pytest

def test_sum_of_list(initialize_list):
    sum=0
    for n in initialize_list:
        sum+=n

    assert sum == 55
