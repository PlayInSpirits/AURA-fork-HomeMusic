.class public final synthetic Ldefpackage/ki4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Ldefpackage/ni4;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ni4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ki4;->a:Ldefpackage/ni4;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/ki4;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;->getDisc()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Ldefpackage/ki4;->a:Ldefpackage/ni4;

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/ni4;->v:Ldefpackage/pk;

    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/pk;->f:Ljava/util/List;

    .line 12
    .line 13
    iget p0, p0, Ldefpackage/ki4;->b:I

    .line 14
    .line 15
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method
