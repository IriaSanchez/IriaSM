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
    /// Lógica de interacción para Binding.xaml
    /// </summary>
    /// 


    public partial class Binding : Window
    {

        Persona persona = new Persona { Nombre = "Iria", Edad = 34};
        public Binding()
        {
            InitializeComponent();
            this.DataContext = persona;
        }

        private void eventoSaludar(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("Hola " + persona.Nombre,
                "Saludo", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }
}
