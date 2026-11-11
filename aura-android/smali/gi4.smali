.class public final synthetic Lgi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Lim3;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic q:I

.field public final synthetic r:Lcom/eddyizm/tempus/ui/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lew4;Lim3;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;ILcom/eddyizm/tempus/ui/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lgi4;->n:Lim3;

    .line 5
    .line 6
    iput-object p3, p0, Lgi4;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lgi4;->p:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 9
    .line 10
    iput p5, p0, Lgi4;->q:I

    .line 11
    .line 12
    iput-object p6, p0, Lgi4;->r:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    new-instance v3, Lpz1;

    .line 2
    .line 3
    const/16 p1, 0x17

    .line 4
    .line 5
    iget-object v0, p0, Lgi4;->r:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    invoke-direct {v3, p1, v0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lgi4;->n:Lim3;

    .line 11
    .line 12
    iget-object p1, v1, Lim3;->f:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Lpz1;->g()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v6, p0, Lgi4;->o:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v6, v1, Lim3;->f:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v6}, Lim3;->e(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    iget-object p1, v1, Lim3;->c:Lmm3;

    .line 28
    .line 29
    new-instance v0, Lem3;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v0, v1, v6, v2}, Lem3;-><init>(Lim3;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {p1, v6, v2, v0}, Lmm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Lk03;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v0, Lgm3;

    .line 41
    .line 42
    iget v4, p0, Lgi4;->q:I

    .line 43
    .line 44
    iget-object v5, p0, Lgi4;->p:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 45
    .line 46
    invoke-direct/range {v0 .. v6}, Lgm3;-><init>(Lim3;Lk03;Lpz1;ILcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lad2;->f(La83;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
