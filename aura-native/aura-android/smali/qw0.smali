.class public final synthetic Lqw0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lsw0;

.field public final synthetic p:Ltw0;


# direct methods
.method public synthetic constructor <init>(Lsw0;Ltw0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqw0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqw0;->o:Lsw0;

    .line 4
    .line 5
    iput-object p2, p0, Lqw0;->p:Ltw0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lqw0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lqw0;->p:Ltw0;

    .line 4
    .line 5
    iget-object p0, p0, Lqw0;->o:Lsw0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lsw0;->a:I

    .line 11
    .line 12
    iget-object p0, p0, Lsw0;->b:Lmt2;

    .line 13
    .line 14
    invoke-interface {v1, v0, p0}, Ltw0;->z(ILmt2;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget v0, p0, Lsw0;->a:I

    .line 19
    .line 20
    iget-object p0, p0, Lsw0;->b:Lmt2;

    .line 21
    .line 22
    invoke-interface {v1, v0, p0}, Ltw0;->M(ILmt2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
