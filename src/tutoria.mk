# O que cada coisinha faz
## Frames:
JFrame frame = new JFrame; // Cria um Frame
frame.setTitle(""); // coloca um titulo no frame
... setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sai da aplicação quando aperta o X
... setResizeble(false); // Faz com que não dê para mudar o tamanho do Frame
... setSize(x,y); // dita a dimensão x e y do Frame, seu tamanho.
... setVisible(true); // torna o frame visivel
ImageIcon nomeDaImagem = new ImageIcon("path da imagem q vai aparecer"); // cria um ImageIcon
... setIconImage(nomeDaImagem.getImage()); // muda o icon do frame
... getContentPane().setBackground(Color.corEscolhida ou new Color(Cor em hexa ou RGB)); // muda a cor do background
... add(label / button / seja lá oq for); // adicionar algo em um frame ou label
... pack(); // deixa tudo compacto de acordo com a maior coisa dentro

## Labels
label.setText(""); //coloca um texto no label
setIcon(imagem q foi criada com ImageIcon);
setHorizontalTextPosition(JLabel.Local onde as coisas vão ficar no label na horizontal);
setVerticalTextPosition(Mesma coisa que antes); onde coisas ficam no label na vestical
setForeground(new Color()); escolhe a cor do texto
setFont(new Font("fonte escolhida", font.ALGUMA_COISA,tamanho);
setIconTextGap(tamanho); espaço entre o texto e a imagem
setBackground(new Color()); escolhe a cor do background
setOpaque(true); // mostra a cor do background
Border borda = BorderFactory.createLineBorder(new Color()); // cria uma borda
setBorder(borda); // escolhe a corda do label
setVerticalAlignment(JLabel.POSIÇÃO); // escolhe uma posição vertical do icontext dentro do label
setHorizontalAlignment(JLabel.POSIÇÃO); // mesma coisa
setBounds(x,y, width, height);// diz onde começa e qual o tamanho do label caso o setLayout do frame esteja em (null)
## Panels


