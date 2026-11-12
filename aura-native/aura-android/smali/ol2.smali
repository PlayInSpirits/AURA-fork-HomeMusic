.class public final synthetic Lol2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Llk3;

.field public final synthetic p:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Llk3;Ljava/lang/Integer;I)V
    .locals 0

    .line 1
    iput p3, p0, Lol2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lol2;->o:Llk3;

    .line 4
    .line 5
    iput-object p2, p0, Lol2;->p:Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lol2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lol2;->p:Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object p0, p0, Lol2;->o:Llk3;

    .line 6
    .line 7
    check-cast p1, Loi3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, Llk3;->v:Z

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p1, v0, p0}, Loi3;->r(IZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Llk3;->d:Lpi3;

    .line 23
    .line 24
    iget-object p0, p0, Llk3;->e:Lpi3;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-interface {p1, v0, p0, v1}, Loi3;->k(Lpi3;Lpi3;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object p0, p0, Llk3;->j:Lcu4;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-interface {p1, p0, v0}, Loi3;->I(Lcu4;I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
