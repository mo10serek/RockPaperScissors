' Created by: Michael Balcerzak
' Created on: 8-September-2016
' Created for: ICS4U
' Daily Assignment – #1-02
' This program displays log companies that the user choose a company And shows the price of logs to fit in a 1100 kg truck. 

Public Class frmRockPaperScissors
    Public Function convertToString(player As String, randomNumber As Integer) As String
        'this function change the interger to a string

        If (randomNumber = 1) Then
            player = "rock"

        ElseIf (randomNumber = 2) Then
            player = "paper"

        ElseIf (randomNumber = 3) Then
            player = "scissors"
        End If

        Return player

    End Function

    Private Sub btnEnter_Click(sender As Object, e As EventArgs) Handles btnEnter.Click
        'varibles
        Dim userPlayer As String = ""
        Dim userRandomNumber As Integer = 0
        Dim computerPlayer As String = ""
        Dim computerRandomNumber As Integer = 0

        'make the player enter their choice
        userRandomNumber = Convert.ToInt32(txtPlayerChoice.Text)

        'make the computer enter their choice
        computerRandomNumber = Int(Rnd() * 3) + 1

        'change the interger to a string
        userPlayer = convertToString(userPlayer, userRandomNumber)
        computerPlayer = convertToString(computerPlayer, computerRandomNumber)

        'tell who won
        If (userRandomNumber = computerRandomNumber) Then
            lblResults.Text = "It is a tie"

        ElseIf (((userRandomNumber = 2) And (computerRandomNumber = 1)) Or ((userRandomNumber = 3) And (computerRandomNumber = 2)) Or ((userRandomNumber = 1) And (computerRandomNumber = 3))) Then
            lblResults.Text = "the user wins"

        ElseIf (((userRandomNumber = 3) And (computerRandomNumber = 1)) Or ((userRandomNumber = 2) And (computerRandomNumber = 3)) Or ((userRandomNumber = 1) And (computerRandomNumber = 2))) Then
            lblResults.Text = "the computer wins"
        End If

        'display what they have
        lblComputer.Text = "computer: " + computerPlayer
        lblPlayer.Text = "player: " + userPlayer
    End Sub

End Class
