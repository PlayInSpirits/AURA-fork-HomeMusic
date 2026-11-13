.class public final synthetic Ldefpackage/ol2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/lk3;

.field public final synthetic p:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/lk3;Ljava/lang/Integer;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/ol2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ol2;->o:Ldefpackage/lk3;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/ol2;->p:Ljava/lang/Integer;

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
    iget v0, p0, Ldefpackage/ol2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ol2;->p:Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ol2;->o:Ldefpackage/lk3;

    .line 6
    .line 7
    check-cast p1, Ldefpackage/oi3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, Ldefpackage/lk3;->v:Z

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p1, v0, p0}, Ldefpackage/oi3;->r(IZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Ldefpackage/lk3;->d:Ldefpackage/pi3;

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/lk3;->e:Ldefpackage/pi3;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-interface {p1, v0, p0, v1}, Ldefpackage/oi3;->k(Ldefpackage/pi3;Ldefpackage/pi3;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    iget-object p0, p0, Ldefpackage/lk3;->j:Ldefpackage/cu4;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-interface {p1, p0, v0}, Ldefpackage/oi3;->I(Ldefpackage/cu4;I)V

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
