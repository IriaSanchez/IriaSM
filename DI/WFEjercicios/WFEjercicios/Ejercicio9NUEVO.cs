using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFEjercicios
{
    public partial class Ejercicio9NUEVO : Form
    {
        public Ejercicio9NUEVO()
        {
            InitializeComponent();
        }

        private void tbNombre_KeyPress(object sender, KeyPressEventArgs e){

            //Cuando vamos tecla a tecla en el text box del Nombre

            char tecla = e.KeyChar;
            bool teclaOK = false;

            //Si la tecla está entre A y Z y a la vez tiene Ñ, la tecla está OK
            if ((tecla >= 'A' && tecla <= 'Z' )|| tecla == 'Ñ'){          
            teclaOK = true;
            }

            //Para coger eliminar (retorno)
            if (tecla == Convert.ToChar(Keys.Back)){         
            teclaOK = true;
            }

            //Si es distinto de teclaOK, entonces le pedimos que noe scriba
            if (!teclaOK){        
            //Para no tener en cuenta la letra si es minúscula y no escribirla
            e.Handled = true;
            } 
        
        }



        //Validating (cuando sales de cada textbox)
        private void tbTelefono_Validating(object sender, CancelEventArgs e)
        {
            int telefono = 0;


            if (!Int32.TryParse(tbTelefono.Text, out telefono))
            {
                MessageBox.Show("El teléfono debe ser un  valor numérico",
                    "Error",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Error);
                e.Cancel = true;
            }
        }


            private void tbMail_Validating(object sender, CancelEventArgs e){


            //Comprobamos el simbolo @ y añadimos contador

            int cantArrobas = 0;

            foreach (char c in tbMail.Text)
            {

                if (c == '@')
                {

                    cantArrobas++;
                }
            }


            //Comprobamos cantidad de @

            if (cantArrobas == 1)
            {

            }
            else if (cantArrobas == 0)
            {

                errorProvider1.SetError(tbMail, "Debe contener al menos una @");
            }

            else
            {
                errorProvider1.SetError(tbMail, "No puede contener mas de una @");
            }
        }














            private void tbTelefono_TextChanged(object sender, EventArgs e)
                    {

            
                    }

        
    }
}