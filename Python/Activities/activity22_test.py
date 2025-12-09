import pytest
def test_sum():
    assert 10 + 15 == 25

def test_difference():
    assert 30 - 15 == 10
@pytest.mark.activity
def test_product():
    assert 4 * 4 == 16

@pytest.mark.activity
def test_quotient():
    assert 8 / 8 == 1
