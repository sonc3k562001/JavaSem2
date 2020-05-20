using System;

    public interface ILoyaltyCardHolder
    {
        int TotalPoints { get; }
        int AddPoint(decimal transactionValue);
        void ResetPoints();
    }
