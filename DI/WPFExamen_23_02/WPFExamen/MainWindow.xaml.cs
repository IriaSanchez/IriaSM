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

namespace WPFExamen
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
            EJERCICIO1 ejercicio1 = new EJERCICIO1();
            ejercicio1.Show();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            EJERCICIO2 ejercicio2 = new EJERCICIO2();
            ejercicio2.Show();
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            EJERCICIO3 ejercicio3 = new EJERCICIO3();
            ejercicio3.Show();
        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {
            EJERCICIO4 ejercicio4 = new EJERCICIO4();
            ejercicio4.Show();
        }

        private void Button_Click_4(object sender, RoutedEventArgs e)
        {
            EJERCICIO5 ejercicio5 = new EJERCICIO5();
            ejercicio5.Show();
        }

        private void Button_Click_5(object sender, RoutedEventArgs e)
        {
            EJERCICIO6 ejercicio6 = new EJERCICIO6();
            ejercicio6.Show();
        }
    }
}
