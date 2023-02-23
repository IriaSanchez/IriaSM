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
using System.Windows.Shapes;

namespace WPFExamen
{
    /// <summary>
    /// Lógica de interacción para EJERCICIO2.xaml
    /// </summary>
    public partial class EJERCICIO2 : Window
    {
        public EJERCICIO2()
        {
            InitializeComponent();
        }

        private void cbEjercicio2_Click(object sender, RoutedEventArgs e)
        {
          
        }

        private void cb2Ejercicio2_Click(object sender, RoutedEventArgs e)
        {
          

        }

        private void btEjercicio2_Click(object sender, RoutedEventArgs e)
        {
            if (cbEjercicio2.IsChecked == true)
            {
                lbEjercicio2.Visibility = Visibility.Visible;
            }
            else
            {
                lbEjercicio2.Visibility = Visibility.Collapsed;
            }
            if (cb2Ejercicio2.IsChecked == true)
            {
                lbEjercicio2.Visibility = Visibility.Visible;
            }
            else
            {
                lbEjercicio2.Visibility = Visibility.Collapsed;
            }
        }
    }
}
