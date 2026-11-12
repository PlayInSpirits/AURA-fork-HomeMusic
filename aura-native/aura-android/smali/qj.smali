.class public final Lqj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic n:Landroid/widget/Button;

.field public final synthetic o:Landroid/widget/Button;

.field public final synthetic p:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final synthetic q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Landroid/widget/Button;Landroid/widget/Button;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqj;->q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lqj;->n:Landroid/widget/Button;

    .line 7
    .line 8
    iput-object p3, p0, Lqj;->o:Landroid/widget/Button;

    .line 9
    .line 10
    iput-object p4, p0, Lqj;->p:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lqj;->p:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lqj;->q:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lqj;->n:Landroid/widget/Button;

    .line 6
    .line 7
    const v3, 0x7f130068

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Landroid/widget/Button;I)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lqj;->o:Landroid/widget/Button;

    .line 14
    .line 15
    const v3, 0x7f130067

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2, v3}, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Landroid/widget/Button;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method
