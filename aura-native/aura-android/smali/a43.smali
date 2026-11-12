.class public final La43;
.super Lqu2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lqu2;->a(IIILjava/lang/CharSequence;)Ltu2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Lm43;

    .line 6
    .line 7
    iget-object p3, p0, Lqu2;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p2, p3, p0, p1}, Len4;-><init>(Landroid/content/Context;Lqu2;Ltu2;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p1, Ltu2;->o:Len4;

    .line 13
    .line 14
    iget-object p0, p1, Ltu2;->e:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-virtual {p2, p0}, Len4;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 17
    .line 18
    .line 19
    return-object p2
.end method
