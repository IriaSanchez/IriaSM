using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
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
    /// Lógica de interacción para Ejercicio1.xaml
    /// </summary>
    public partial class Ejercicio1 : Window
    {
        public Ejercicio1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {

            //String para el texto que escribamos en el textbox
            String texto = tb_ej1.Text;

            //Añadimos al label el contenido "Hola" + el texto
            lb_ej1.Content = "Hola " + texto;
        }
    }
}
