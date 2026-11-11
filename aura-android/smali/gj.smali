.class public final Lgj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/SearchView$OnQueryTextListener;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgj;->a:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onQueryTextChange(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgj;->a:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method public final onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lgj;->a:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Search: "

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0
.end method
