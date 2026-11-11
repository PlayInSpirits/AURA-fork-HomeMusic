.class public final Lkn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lwo0;

.field public b:Lo72;

.field public final c:Lhn4;

.field public final d:Lhn4;

.field public final e:Lhn4;


# direct methods
.method public constructor <init>(Lwo0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkn4;->a:Lwo0;

    .line 5
    .line 6
    new-instance p1, Lhn4;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lhn4;-><init>(Lkn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lkn4;->c:Lhn4;

    .line 13
    .line 14
    new-instance p1, Lhn4;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, v0}, Lhn4;-><init>(Lkn4;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lkn4;->d:Lhn4;

    .line 21
    .line 22
    new-instance p1, Lhn4;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, v0}, Lhn4;-><init>(Lkn4;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lkn4;->e:Lhn4;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lo72;
    .locals 0

    .line 1
    iget-object p0, p0, Lkn4;->b:Lo72;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
