echo "Enter the basic salary:"
read salary
hra=0
da=0
gross_sal=0
if [ "$salary" -lt 15000 ]
then
  hra=$(( salary * 2 / 100 ))
  da=$(( salary * 98 / 100 ))
else
  hra=$(( salary * 10 / 100 ))
  da=$(( salary * 90 / 100 ))
fi
gross_sal=$(( salary+hra + da ))
echo "HRA: $hra"
echo "DA: $da"
echo "GROSS SALARY: $gross_sal"

: << 'END_COMMENT'
1. Input: Prompt the user to enter the basic salary.
2. Initialize Variables:
hra to 0 (House Rent Allowance).
da to 0 (Dearness Allowance).
gross_sal to 0 (Gross Salary).
3. Decision Making:
If the basic salary is less than 15,000:
Calculate hra as 2% of the basic salary.
Calculate da as 98% of the basic salary.
Calculate gross_sal as the sum of basic salary, hra, and da.
Else if the basic salary is greater than 15,000:
Calculate hra as 10% of the basic salary.
Calculate da as 90% of the basic salary.
Calculate gross_sal as the sum of basic salary, hra, and da.
Otherwise, handle any invalid input appropriately.
4. Output: Display hra, da, and gross_sal.
END_COMMENT
