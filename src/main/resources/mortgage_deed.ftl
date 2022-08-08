<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>Standardised Mortgage Deed</title>
    <link rel="stylesheet" type="text/css" href="./style.css"/>
</head>

<body>
<div id="header">&lt;Type&gt; Mortgage Deed<br></br>Version &lt;1.0&gt;</div>
<div id="footer">Form of charge filed at HM Land Registry under reference &lt;MDRef&gt;</div>
<div align="center">
    <table>
        <thead>
        <tr>
            <th colspan="4">
                <p class="h1"><b>MORTGAGE DEED</b></p>
            </th>
        </tr>
        </thead>
        <tr>
            <td colspan="1">
                <p class="body"><b>Date:</b></p>
            </td>
            <td colspan="3">
                <p class="body">${mortgageDeed.deedGoLiveDate}</p>
            </td>
        </tr>
        <tr>
            <td colspan="1">
                <p class="body"><b>Property:</b></p>
            </td>
            <td colspan="1">
                <p class="body" style="text-align:center"><b>Description</b></p>
            </td>
            <td colspan="1">
                <p class="body" style="text-align:center"><b>Tenure</b></p>
            </td>
            <td colspan="1">
                <p class="body" style="text-align:center"><b>Title number</b></p>
            </td>
        </tr>
        <tr>
            <td colspan="1">
            </td>
            <td colspan="1">
                <p class="body">${mortgageDeed.securityAddress}</p>
            </td>
            <td colspan="1">
                <p class="body">${mortgageDeed.tenure} years</p>
            </td>
            <td colspan="1">
                <p class="body">${mortgageDeed.titleNumber}</p>
            </td>
        </tr>
        <tr>
            <td colspan="1">
                <p class="body"><b>Lender:</b></p>
            </td>
            <td colspan="3">
                <p class="body">${mortgageDeed.lender.companyName}</p>
                <#if mortgageDeed.lender.address ? has_content>
                    <p class="body">${mortgageDeed.lender.address}</p>
                    <p class="body">(Registered in England and Wales with company registration number: ${mortgageDeed.lender.regNumber} )</p>
                </#if>
            </td>
        </tr>
        <tr>
            <td colspan="1">
                <p class="body"><b>Borrower(s):</b></p>
            </td>
            <td colspan="3">
                <p class="body">${mortgageDeed.borrowerName}</p>
            </td>
        </tr>
        <tr>
            <td colspan="1">
                <p class="body"><b>Charging clause:</b></p>
            </td>
            <td colspan="3">
                <p class="body">The Borrower(s),
                    with full title guarantee, charges to the Lender the Property by way of legal
                    mortgage with payment of all money secured by this charge.</p>
            </td>
        </tr>
        <#if mortgageDeed.restrictionRequired>
            <tr>
                <td colspan="1">
                    <p class="body"><b>Restriction:</b></p>
                </td>
                <td colspan="3">
                    <p class="body">${mortgageDeed.restrictionText}</p>
                </td>
            </tr>
        </#if>
        <#if mortgageDeed.obligationRequired>
            <tr>
                <td colspan="1">
                    <p class="body"><b>Obligation:</b></p>
                </td>
                <td colspan="3">
                    <p class="body">${mortgageDeed.obligationText}</p>
                </td>
            </tr>
        </#if>
        <#if mortgageDeed.additionalProvisionsRequired>
            <tr>
                <td colspan="1">
                    <p class="body"><b>Additional provisions:</b></p>
                </td>
                <td colspan="3">
                    <p class="body">${mortgageDeed.additionalProvisionsText}</p>
                </td>
            </tr>
        </#if>
    </table>
</div>

<div class="emptyDiv"></div>

<div align="center">
    <table>
        <tr>
            <td colspan="2">
                <p class="body"><b>Signed as a deed by the Borrower(s) in the presence of the witness.</b></p>
            </td>
        </tr>
        <#foreach deedRow in mortgageDeed.deedRows>
            <tr>
                <td colspan="1">
                    <p class="body">Your full name:</p>
                    <p class="body">${deedRow.borrower.name}</p>
                    <p class="body">&nbsp;</p>
                    <p class="body">Signature:</p>
                    <p class="body">&lt;Borrower Sign&gt;</p>
                </td>
                <td colspan="1">
                    <p class="body">Witness signature:</p>
                    <p class="body">&lt;Witness sign&gt;</p>
                    <p class="body">Witness full name (BLOCK CAPITALS):</p>
                    <p class="body">${deedRow.witness.name}</p>
                    <p class="body">Witness address:</p>
                    <p class="body">${deedRow.witness.address}</p>
                </td>
            </tr>
        </#foreach>
    </table>
</div>

<div class="emptyDiv"></div>

<div align="center">
    <table>
        <tr>
            <td colspan="2">
                <p class="body">Lender:</p>
                <p class="body">${mortgageDeed.lender.companyName}</p>
            </td>
            <td colspan="1">
                <p class="body">Signed by:</p>
                <p class="body">&lt;Sign&gt;</p>
            </td>
            <td colspan="1">
                <p class="body">Acting by its attorney</p>
                <p class="body">&lt;data&gt;</p>
            </td>
        </tr>
    </table>
</div>
</body>

</html>