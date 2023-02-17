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

namespace SimulacroWPF2
{
    /// <summary>
    /// Lógica de interacción para Ejercicio2.xaml
    /// </summary>
    public partial class Ejercicio2 : Window
    {
        public Ejercicio2()
        {
            InitializeComponent();
        }

     

      

        private void cb_hugo_Click(object sender, RoutedEventArgs e)
        {
            //Si haces click en el checkbox del nombre
            //le das visibilidad al label del nombre

            if(cb_hugo.IsChecked == true) { 
            lb_hugo.Visibility = Visibility.Visible;

            }

            //De lo contrario, se colapsan
            else
            {
                lb_hugo.Visibility = Visibility.Collapsed;
            }


        }

        private void cb_diaz_Click(object sender, RoutedEventArgs e)
        {
            //Si haces click en el checkbox del apellido
            //le das visibilidad al label del apellido

            if (cb_diaz.IsChecked == true)
            {
                lb_diaz.Visibility = Visibility.Visible;

            }

            //De lo contrario, se colapsan
            else
            {
                lb_diaz.Visibility = Visibility.Collapsed;
            }
        }
    }
}
