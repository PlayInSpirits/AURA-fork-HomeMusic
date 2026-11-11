.class public final synthetic Lpt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lue1;

.field public final synthetic p:Led2;

.field public final synthetic q:Lun2;


# direct methods
.method public synthetic constructor <init>(Lue1;Led2;Lun2;I)V
    .locals 0

    .line 1
    iput p4, p0, Lpt2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpt2;->o:Lue1;

    .line 4
    .line 5
    iput-object p2, p0, Lpt2;->p:Led2;

    .line 6
    .line 7
    iput-object p3, p0, Lpt2;->q:Lun2;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lpt2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lpt2;->q:Lun2;

    .line 4
    .line 5
    iget-object v2, p0, Lpt2;->p:Led2;

    .line 6
    .line 7
    iget-object p0, p0, Lpt2;->o:Lue1;

    .line 8
    .line 9
    check-cast p1, Lst2;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lue1;->o:I

    .line 15
    .line 16
    iget-object p0, p0, Lue1;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lmt2;

    .line 19
    .line 20
    invoke-interface {p1, v0, p0, v2, v1}, Lst2;->u(ILmt2;Led2;Lun2;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget v0, p0, Lue1;->o:I

    .line 25
    .line 26
    iget-object p0, p0, Lue1;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lmt2;

    .line 29
    .line 30
    invoke-interface {p1, v0, p0, v2, v1}, Lst2;->w(ILmt2;Led2;Lun2;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
