.class public final synthetic Lto1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Z

.field public final synthetic q:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

.field public final synthetic r:Lni4;

.field public final synthetic s:Ljava/util/List;

.field public final synthetic t:Lsi4;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;ZLcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Lni4;Ljava/util/List;Lsi4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lto1;->n:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lto1;->o:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lto1;->p:Z

    .line 9
    .line 10
    iput-object p4, p0, Lto1;->q:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 11
    .line 12
    iput-object p5, p0, Lto1;->r:Lni4;

    .line 13
    .line 14
    iput-object p6, p0, Lto1;->s:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lto1;->t:Lsi4;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Lto1;->n:Landroid/content/Context;

    .line 3
    .line 4
    iget-object v1, p0, Lto1;->o:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {v0, v1, p1}, Ljz4;->J(Landroid/content/Context;Ljava/util/List;Z)V

    .line 7
    .line 8
    .line 9
    iget-boolean p1, p0, Lto1;->p:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lto1;->q:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 14
    .line 15
    iget-object p1, p1, Lkc1;->T:Landroid/view/View;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lto1;->r:Lni4;

    .line 20
    .line 21
    iget-object v0, p0, Lto1;->s:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lni4;->r(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lto1;->t:Lsi4;

    .line 27
    .line 28
    invoke-virtual {p0}, Lsi4;->run()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method
