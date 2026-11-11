.class public final synthetic Lpk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbl2;

.field public final synthetic p:Lsk2;


# direct methods
.method public synthetic constructor <init>(Lbl2;Lsk2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lpk2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpk2;->o:Lbl2;

    .line 4
    .line 5
    iput-object p2, p0, Lpk2;->p:Lsk2;

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
    iget v0, p0, Lpk2;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpk2;->o:Lbl2;

    .line 7
    .line 8
    iget-object p0, p0, Lpk2;->p:Lsk2;

    .line 9
    .line 10
    iget-object v0, v0, Lu0;->n:Ljava/lang/Object;

    .line 11
    .line 12
    instance-of v0, v0, Lf0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lsk2;->Y0()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lpk2;->o:Lbl2;

    .line 21
    .line 22
    iget-object p0, p0, Lpk2;->p:Lsk2;

    .line 23
    .line 24
    iput-object p0, v0, Lbl2;->v:Lsk2;

    .line 25
    .line 26
    iget-boolean v1, v0, Lbl2;->w:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    new-instance v1, Lpk2;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, v0, p0, v2}, Lpk2;-><init>(Lbl2;Lsk2;I)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Lh41;

    .line 40
    .line 41
    invoke-direct {p0, v2, v0}, Lh41;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
