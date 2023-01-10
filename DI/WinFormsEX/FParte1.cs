using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace WinFormsEX
{
    public partial class FParte1 : Form
    {
        public FParte1()
        {
            InitializeComponent();
        }


        //  Al mostrar “FParte1” se visualizará en Label el valor 0.
        // Si el usuario pulsa el botón “Iniciar” se pondrá
        //en la Label el valor 0 y cada segundo se irá
        //incrementando el valor de la Label en 1.
        // Si el usuario pulsa de nuevo el botón “Saltar”
        //se añadirá 10 al valor actual de la Label.
        private void timer1_Tick(object sender, EventArgs e)
        {

            


        }
    }
}
