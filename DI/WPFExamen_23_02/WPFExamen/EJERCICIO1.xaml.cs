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
    /// Lógica de interacción para EJERCICIO1.xaml
    /// </summary>
    public partial class EJERCICIO1 : Window
    {
        public EJERCICIO1()
        {
            InitializeComponent();
        }

        private void evento_Ejercicio1(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("Hola " + tbEjercicio1.Text, "Bienvenido", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }
}
