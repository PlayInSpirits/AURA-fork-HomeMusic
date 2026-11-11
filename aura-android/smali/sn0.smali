.class public final synthetic Lsn0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lgp3;


# direct methods
.method public synthetic constructor <init>(Lgp3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsn0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsn0;->o:Lgp3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lsn0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lsn0;->o:Lgp3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ltn0;

    .line 11
    .line 12
    iget-object p0, p0, Ltn0;->h:Lq55;

    .line 13
    .line 14
    invoke-interface {p0}, Lq55;->c()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ltn0;

    .line 21
    .line 22
    iget-object p0, p0, Ltn0;->h:Lq55;

    .line 23
    .line 24
    invoke-interface {p0}, Lq55;->b()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
