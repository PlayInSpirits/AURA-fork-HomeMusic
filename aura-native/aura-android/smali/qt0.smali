.class public final Lqt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Lss0;

.field public final p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lss0;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lqt0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqt0;->o:Lss0;

    .line 4
    .line 5
    iput-object p2, p0, Lqt0;->p:Ljava/lang/String;

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
    .locals 3

    .line 1
    iget v0, p0, Lqt0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqt0;->o:Lss0;

    .line 7
    .line 8
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls24;

    .line 11
    .line 12
    new-instance v1, Lrs0;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    iget-object p0, p0, Lqt0;->p:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v1, v2, p0}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-static {v0, p0, v2, v1}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lqt0;->o:Lss0;

    .line 27
    .line 28
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ls24;

    .line 31
    .line 32
    new-instance v1, Lrs0;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iget-object p0, p0, Lqt0;->p:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v1, v2, p0}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    invoke-static {v0, p0, v2, v1}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
