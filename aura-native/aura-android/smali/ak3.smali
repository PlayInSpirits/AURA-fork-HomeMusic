.class public final Lak3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/RatingBar$OnRatingBarChangeListener;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lak3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lak3;->a:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onRatingChanged(Landroid/widget/RatingBar;FZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lak3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0:Lpu3;

    .line 6
    .line 7
    float-to-int p2, p2

    .line 8
    invoke-virtual {p1, p2}, Lpu3;->c(I)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lak3;->a:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 12
    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
