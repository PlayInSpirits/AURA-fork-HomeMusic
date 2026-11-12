.class public final synthetic Lnm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lxc5;

.field public final synthetic p:Lpa;


# direct methods
.method public synthetic constructor <init>(Lxc5;Lpa;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnm;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnm;->o:Lxc5;

    .line 4
    .line 5
    iput-object p2, p0, Lnm;->p:Lpa;

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
    iget v0, p0, Lnm;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lnm;->p:Lpa;

    .line 4
    .line 5
    iget-object p0, p0, Lnm;->o:Lxc5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxc5;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lqm;

    .line 13
    .line 14
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p0, v1}, Lqm;->j(Lpa;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Lxc5;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lqm;

    .line 23
    .line 24
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, v1}, Lqm;->f(Lpa;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
