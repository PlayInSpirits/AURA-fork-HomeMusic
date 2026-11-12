.class public final synthetic Lmn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Llb4;

.field public final synthetic p:Lic2;


# direct methods
.method public synthetic constructor <init>(Llb4;Lic2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmn2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lmn2;->o:Llb4;

    .line 4
    .line 5
    iput-object p2, p0, Lmn2;->p:Lic2;

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
    iget v0, p0, Lmn2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lmn2;->o:Llb4;

    .line 8
    .line 9
    iget-object p0, p0, Lmn2;->p:Lic2;

    .line 10
    .line 11
    iget-object v0, v0, Lu0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v0, v0, Lf0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lmn2;->o:Llb4;

    .line 22
    .line 23
    iget-object p0, p0, Lmn2;->p:Lic2;

    .line 24
    .line 25
    iget-object v0, v0, Lu0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v0, v0, Lf0;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
