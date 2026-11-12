.class public final synthetic Lrl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lks2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FI)V
    .locals 0

    .line 1
    iput p3, p0, Lrl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lrl2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lrl2;->p:F

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b(Lfr2;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lrl2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lls2;

    .line 4
    .line 5
    iget-object p1, p1, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 8
    .line 9
    iget p0, p0, Lrl2;->p:F

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Lal3;->e(F)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public d(Lpu1;I)V
    .locals 3

    .line 1
    iget v0, p0, Lrl2;->n:I

    .line 2
    .line 3
    iget v1, p0, Lrl2;->p:F

    .line 4
    .line 5
    iget-object p0, p0, Lrl2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lbm2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lbm2;->n:Lcb4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lcb4;->a:Lbb4;

    .line 18
    .line 19
    invoke-interface {v0}, Lbb4;->f()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 24
    .line 25
    const/4 v2, 0x6

    .line 26
    if-lt v0, v2, :cond_0

    .line 27
    .line 28
    invoke-interface {p1, p0, p2}, Lpu1;->p(Lju1;I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1, p0, p2, v1}, Lpu1;->x(Lju1;IF)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :pswitch_0
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 37
    .line 38
    invoke-interface {p1, p0, p2, v1}, Lpu1;->x(Lju1;IF)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 43
    .line 44
    invoke-interface {p1, p0, p2, v1}, Lpu1;->w(Lju1;IF)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
