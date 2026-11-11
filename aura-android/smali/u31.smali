.class public final synthetic Lu31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrc2;
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Li41;


# direct methods
.method public synthetic constructor <init>(Li41;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu31;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lu31;->o:Li41;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;Lw71;)V
    .locals 1

    .line 1
    check-cast p1, Loi3;

    .line 2
    .line 3
    iget-object p0, p0, Lu31;->o:Li41;

    .line 4
    .line 5
    iget-object p0, p0, Li41;->g:Li41;

    .line 6
    .line 7
    new-instance v0, Lni3;

    .line 8
    .line 9
    invoke-direct {v0, p2}, Lni3;-><init>(Lw71;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Loi3;->B(Lqi3;Lni3;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lu31;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lu31;->o:Li41;

    .line 4
    .line 5
    check-cast p1, Loi3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Li41;->T:Ldo2;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Loi3;->G(Ldo2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Li41;->R:Lmi3;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Loi3;->O(Lmi3;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
