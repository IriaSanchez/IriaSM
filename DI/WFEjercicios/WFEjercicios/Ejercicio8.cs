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
    public partial class Ejercicio8 : Form
    {

        TextBox tbEjercicio8 = new TextBox();


        public Ejercicio8()
        {
            InitializeComponent();
        }

        private void Ejercicio8_Load(object sender, EventArgs e)
        {
            this.agregarLabeldinamicoo();
            this.crearBoton();
            this.agregarBotonDinamico();
        }

        private void agregarLabeldinamicoo()
        {
            Label labelDinamico = new Label();
            labelDinamico.Name = "labelDinamico";
            labelDinamico.Text = "Nombre";
            labelDinamico.Location = new System.Drawing.Point(12, 45);
            Font fuente = new Font("Arial", 20);
            labelDinamico.Font = fuente;
            this.Controls.Add(labelDinamico);

        }


        private void crearBoton()
        {
            tbEjercicio8.Location = new System.Drawing.Point(120,52);
            tbEjercicio8.Width = 150;
            tbEjercicio8.MaxLength = 20;
            this.Controls.Add(tbEjercicio8);

        }


        private void agregarBotonDinamico()
        {
            Button btnDinamico = new Button();
            btnDinamico.Name = "btnDinamico";
            btnDinamico.Text = "Saludo";
            btnDinamico.Location = new System.Drawing.Point(20, 100);
            btnDinamico.Size = new System.Drawing.Size(80, 30);
            btnDinamico.BackColor = System.Drawing.Color.AliceBlue;
            btnDinamico.Click += new EventHandler(pruebaClick);

            this.Controls.Add(btnDinamico);

        }

        private void pruebaClick(object sender, EventArgs e)
        {
            MessageBox.Show("Hola " + tbEjercicio8.Text,
                "Saludo",
            MessageBoxButtons.OK,
            MessageBoxIcon.Information);
        }


    }
}
