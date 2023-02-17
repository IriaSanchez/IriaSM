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
    public partial class Ejercicio3 : Window
    {
        public Ejercicio3()
        {
            InitializeComponent();
        }

        private void btIniciar_Click(object sender, RoutedEventArgs e)
        {
                pb_ej3.IsIndeterminate= true;
           
        }

        private void btParar_Click(object sender, RoutedEventArgs e)
        {
            pb_ej3.IsIndeterminate = false;
        }
    }
}
