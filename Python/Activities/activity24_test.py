import pytest

@pytest.fixture
def wallet_amnt():
    amount=0
    return amount
@pytest.mark.parametrize("earned, spent, expected", [
    (30, 10, 20),
    (20, 2, 18),
    (50, 20, 30),
    (100, 50, 50)
])
def test_transactions(wallet_amnt, earned, spent, expected):
    wallet_amnt += earned
    wallet_amnt -= spent
    assert wallet_amnt == expected
