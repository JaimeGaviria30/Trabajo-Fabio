Imports System

Module Program
    Sub Main(args As String())

        Dim a As Integer = -1
        Dim b As Integer = 1
        Dim c As Integer = 1
        Dim r As Integer = 0

        Dim n As Integer
        Dim x As Integer

        Console.WriteLine("Ingrese el número")
        n = Console.ReadLine

        Do While c < n
            If r = 0 Then
                Console.WriteLine(a)
                a = a * (-1)
                a = a + b
                x = a
                a = a * (-1)
                c = c + 1
                r = 1
            End If
            Console.WriteLine(b)
            b = x + b
            c = c + 1
            r = 0
        Loop
        Console.ReadKey()



    End Sub
End Module
