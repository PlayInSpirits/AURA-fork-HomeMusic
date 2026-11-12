.class public final synthetic Lr31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldo2;


# direct methods
.method public synthetic constructor <init>(Ldo2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr31;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lr31;->o:Ldo2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lr31;->o:Ldo2;

    .line 2
    .line 3
    check-cast p1, Lal3;

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Lal3;->l0(Ldo2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lr31;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lr31;->o:Ldo2;

    .line 4
    .line 5
    check-cast p1, Loi3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0}, Loi3;->G(Ldo2;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-interface {p1, p0}, Loi3;->F(Ldo2;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
