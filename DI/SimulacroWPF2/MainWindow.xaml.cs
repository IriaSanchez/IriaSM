using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace SimulacroWPF2
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Ejercicio1 ejercicio1 = new Ejercicio1();
            ejercicio1.Show();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Ejercicio2 ejercicio2 = new Ejercicio2();
            ejercicio2.Show();  
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Ejercicio3 ejercicio3 = new Ejercicio3();
            ejercicio3.Show();
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            Ejercicio4 ejercicio4 = new Ejercicio4();
            ejercicio4.Show();
        }

        private void Button_Click_4(object sender, RoutedEventArgs e)
        {
            Ejercicio5 ejercicio5 = new Ejercicio5();
            ejercicio5.Show();
        }

        private void Button_Click_5(object sender, RoutedEventArgs e)
        {
            Ejercicio6 ejercicio6 = new Ejercicio6();
            ejercicio6.Show();
        }

        private void Button_Click_6(object sender, RoutedEventArgs e)
        {
            Ejercicio7 ejercicio7 = new Ejercicio7();
            ejercicio7.Show();
        }

        private void Button_Click_7(object sender, RoutedEventArgs e)
        {
            Ejercicio8 ejercicio8 = new Ejercicio8();
            ejercicio8.Show();
        }

        private void Button_Click_8(object sender, RoutedEventArgs e)
        {
            Ejercicio9 ejercicio9 = new Ejercicio9();
            ejercicio9.Show();
        }
    }
}
