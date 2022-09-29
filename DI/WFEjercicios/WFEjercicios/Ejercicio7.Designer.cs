namespace WFEjercicios
{
    partial class Ejercicio7
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.btEliminar = new System.Windows.Forms.Button();
            this.cbTurno = new System.Windows.Forms.ComboBox();
            this.btAñadir = new System.Windows.Forms.Button();
            this.checkComedor = new System.Windows.Forms.CheckBox();
            this.lbComedor = new System.Windows.Forms.Label();
            this.lbTurno = new System.Windows.Forms.Label();
            this.DTPFecha = new System.Windows.Forms.DateTimePicker();
            this.lbFechaAlta = new System.Windows.Forms.Label();
            this.tbEdad = new System.Windows.Forms.TextBox();
            this.lbEdad = new System.Windows.Forms.Label();
            this.tbNombre = new System.Windows.Forms.TextBox();
            this.lbNombre = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.DGVAlumnos = new System.Windows.Forms.DataGridView();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.DGVAlumnos)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.panel1.Controls.Add(this.btEliminar);
            this.panel1.Controls.Add(this.cbTurno);
            this.panel1.Controls.Add(this.btAñadir);
            this.panel1.Controls.Add(this.checkComedor);
            this.panel1.Controls.Add(this.lbComedor);
            this.panel1.Controls.Add(this.lbTurno);
            this.panel1.Controls.Add(this.DTPFecha);
            this.panel1.Controls.Add(this.lbFechaAlta);
            this.panel1.Controls.Add(this.tbEdad);
            this.panel1.Controls.Add(this.lbEdad);
            this.panel1.Controls.Add(this.tbNombre);
            this.panel1.Controls.Add(this.lbNombre);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(248, 513);
            this.panel1.TabIndex = 0;
            // 
            // btEliminar
            // 
            this.btEliminar.Location = new System.Drawing.Point(56, 429);
            this.btEliminar.Name = "btEliminar";
            this.btEliminar.Size = new System.Drawing.Size(111, 23);
            this.btEliminar.TabIndex = 1;
            this.btEliminar.Text = "Eliminar";
            this.btEliminar.UseVisualStyleBackColor = true;
            this.btEliminar.Click += new System.EventHandler(this.btEliminar_Click);
            // 
            // cbTurno
            // 
            this.cbTurno.FormattingEnabled = true;
            this.cbTurno.Items.AddRange(new object[] {
            "Mañana",
            "Tarde"});
            this.cbTurno.Location = new System.Drawing.Point(92, 191);
            this.cbTurno.Name = "cbTurno";
            this.cbTurno.Size = new System.Drawing.Size(101, 21);
            this.cbTurno.TabIndex = 9;
            this.cbTurno.Text = "Mañana";
            // 
            // btAñadir
            // 
            this.btAñadir.Location = new System.Drawing.Point(56, 386);
            this.btAñadir.Name = "btAñadir";
            this.btAñadir.Size = new System.Drawing.Size(111, 23);
            this.btAñadir.TabIndex = 0;
            this.btAñadir.Text = "Añadir";
            this.btAñadir.UseVisualStyleBackColor = true;
            this.btAñadir.Click += new System.EventHandler(this.btAñadir_Click);
            // 
            // checkComedor
            // 
            this.checkComedor.AutoSize = true;
            this.checkComedor.Location = new System.Drawing.Point(92, 241);
            this.checkComedor.Name = "checkComedor";
            this.checkComedor.Size = new System.Drawing.Size(15, 14);
            this.checkComedor.TabIndex = 8;
            this.checkComedor.UseVisualStyleBackColor = true;
            // 
            // lbComedor
            // 
            this.lbComedor.AutoSize = true;
            this.lbComedor.Location = new System.Drawing.Point(12, 242);
            this.lbComedor.Name = "lbComedor";
            this.lbComedor.Size = new System.Drawing.Size(49, 13);
            this.lbComedor.TabIndex = 7;
            this.lbComedor.Text = "Comedor";
            // 
            // lbTurno
            // 
            this.lbTurno.AutoSize = true;
            this.lbTurno.Location = new System.Drawing.Point(12, 194);
            this.lbTurno.Name = "lbTurno";
            this.lbTurno.Size = new System.Drawing.Size(35, 13);
            this.lbTurno.TabIndex = 6;
            this.lbTurno.Text = "Turno";
            // 
            // DTPFecha
            // 
            this.DTPFecha.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.DTPFecha.Location = new System.Drawing.Point(92, 144);
            this.DTPFecha.Name = "DTPFecha";
            this.DTPFecha.Size = new System.Drawing.Size(101, 20);
            this.DTPFecha.TabIndex = 5;
            // 
            // lbFechaAlta
            // 
            this.lbFechaAlta.AutoSize = true;
            this.lbFechaAlta.Location = new System.Drawing.Point(12, 144);
            this.lbFechaAlta.Name = "lbFechaAlta";
            this.lbFechaAlta.Size = new System.Drawing.Size(72, 13);
            this.lbFechaAlta.TabIndex = 4;
            this.lbFechaAlta.Text = "Fecha de alta";
            // 
            // tbEdad
            // 
            this.tbEdad.Location = new System.Drawing.Point(92, 103);
            this.tbEdad.Name = "tbEdad";
            this.tbEdad.Size = new System.Drawing.Size(100, 20);
            this.tbEdad.TabIndex = 3;
            this.tbEdad.TextChanged += new System.EventHandler(this.tbEdad_TextChanged);
            // 
            // lbEdad
            // 
            this.lbEdad.AutoSize = true;
            this.lbEdad.Location = new System.Drawing.Point(12, 103);
            this.lbEdad.Name = "lbEdad";
            this.lbEdad.Size = new System.Drawing.Size(32, 13);
            this.lbEdad.TabIndex = 2;
            this.lbEdad.Text = "Edad";
            // 
            // tbNombre
            // 
            this.tbNombre.Location = new System.Drawing.Point(92, 61);
            this.tbNombre.Name = "tbNombre";
            this.tbNombre.Size = new System.Drawing.Size(100, 20);
            this.tbNombre.TabIndex = 1;
            this.tbNombre.TextChanged += new System.EventHandler(this.tbNombre_TextChanged);
            // 
            // lbNombre
            // 
            this.lbNombre.AutoSize = true;
            this.lbNombre.Location = new System.Drawing.Point(12, 61);
            this.lbNombre.Name = "lbNombre";
            this.lbNombre.Size = new System.Drawing.Size(44, 13);
            this.lbNombre.TabIndex = 0;
            this.lbNombre.Text = "Nombre";
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.panel2.Controls.Add(this.DGVAlumnos);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(248, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(680, 513);
            this.panel2.TabIndex = 1;
            this.panel2.Paint += new System.Windows.Forms.PaintEventHandler(this.panel2_Paint);
            // 
            // DGVAlumnos
            // 
            this.DGVAlumnos.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.DGVAlumnos.Dock = System.Windows.Forms.DockStyle.Fill;
            this.DGVAlumnos.Location = new System.Drawing.Point(0, 0);
            this.DGVAlumnos.Name = "DGVAlumnos";
            this.DGVAlumnos.Size = new System.Drawing.Size(680, 513);
            this.DGVAlumnos.TabIndex = 0;
            this.DGVAlumnos.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.DGVAlumnos_CellContentClick);
            // 
            // Ejercicio7
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(928, 513);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "Ejercicio7";
            this.Text = "Ejercicio7";
            this.Load += new System.EventHandler(this.Ejercicio7_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.DGVAlumnos)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label lbTurno;
        private System.Windows.Forms.DateTimePicker DTPFecha;
        private System.Windows.Forms.Label lbFechaAlta;
        private System.Windows.Forms.TextBox tbEdad;
        private System.Windows.Forms.Label lbEdad;
        private System.Windows.Forms.TextBox tbNombre;
        private System.Windows.Forms.Label lbNombre;
        private System.Windows.Forms.CheckBox checkComedor;
        private System.Windows.Forms.Label lbComedor;
        private System.Windows.Forms.ComboBox cbTurno;
        private System.Windows.Forms.Button btEliminar;
        private System.Windows.Forms.Button btAñadir;
        private System.Windows.Forms.DataGridView DGVAlumnos;
    }
}