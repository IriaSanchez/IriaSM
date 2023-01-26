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

namespace WPFPrueba
{
    /// <summary>
    /// Lógica de interacción para EstilosAplicacion.xaml
    /// </summary>
    public partial class EstilosAplicacion : Window
    {
        public EstilosAplicacion()
        {
            InitializeComponent();
        }

        private void eventoSaludo(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("Hola " + txtNombre.Text, "Saludo", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }


    
}
