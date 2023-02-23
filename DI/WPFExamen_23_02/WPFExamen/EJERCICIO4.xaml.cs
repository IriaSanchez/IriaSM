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
    /// Lógica de interacción para EJERCICIO4.xaml
    /// </summary>
    public partial class EJERCICIO4 : Window
    {
        public EJERCICIO4()
        {
            InitializeComponent();
        }

        private void cb1_Ejercicio4_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            if (cb1_Ejercicio4.SelectedItem.ToString() == "Colores")
            {
               
                    if (Tag.ToString() == "Color")
                    {
                        Visibility = Visibility.Visible;
                    }
                    else
                    {
                        Visibility = Visibility.Collapsed;
                    }
                
            }
            else if (cb1_Ejercicio4.SelectedItem.ToString() == "Números")
            {
               
                    if (Tag.ToString() == "Numero")
                    {
                        Visibility = Visibility.Visible;
                    }
                    else
                    {
                       Visibility = Visibility.Collapsed;
                    }
                
            }


        }







    }
}
