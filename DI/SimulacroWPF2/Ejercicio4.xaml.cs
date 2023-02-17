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
    public partial class Ejercicio4 : Window
    {
        public Ejercicio4()
        {
            InitializeComponent();
        }

        private void cbEJ4_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (cbEJ4.SelectedIndex == 0)
            {
                Page_Hola page_Hola= new Page_Hola();
                frameEJ4.Navigate(page_Hola);
            }
            else
            {
                Page_Ciao page_Ciao= new Page_Ciao();
                frameEJ4.Navigate(page_Ciao);
            }
        }
    }
}
