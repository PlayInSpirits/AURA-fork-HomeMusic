.class public final synthetic Lno1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lpo1;


# direct methods
.method public synthetic constructor <init>(Lpo1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lno1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lno1;->o:Lpo1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lno1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lno1;->o:Lpo1;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-static {p1}, Lud3;->l0(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, v0}, Lpp0;->i0(ZZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p0, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 23
    .line 24
    iget-object v1, p0, Lpo1;->D0:Lro1;

    .line 25
    .line 26
    iget-object v1, v1, Lro1;->q:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lud3;->l0(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v0}, Lpp0;->i0(ZZ)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
