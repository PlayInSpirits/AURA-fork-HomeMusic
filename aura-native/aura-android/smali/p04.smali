.class public final Lp04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lci0;


# instance fields
.field public final n:Lci0;

.field public o:Z


# direct methods
.method public constructor <init>(Lci0;Lmj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp04;->n:Lci0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lii0;)J
    .locals 1

    .line 1
    invoke-virtual {p1}, Lii0;->a()Lhi0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget p1, p1, Lii0;->i:I

    .line 6
    .line 7
    and-int/lit8 p1, p1, -0x3

    .line 8
    .line 9
    iput p1, v0, Lhi0;->i:I

    .line 10
    .line 11
    invoke-virtual {v0}, Lhi0;->a()Lii0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lp04;->o:Z

    .line 17
    .line 18
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Lci0;->b(Lii0;)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    return-wide p0
.end method

.method public final c(Lrw4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lci0;->c(Lrw4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp04;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lp04;->o:Z

    .line 7
    .line 8
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 9
    .line 10
    invoke-interface {p0}, Lci0;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final j()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 2
    .line 3
    invoke-interface {p0}, Lci0;->j()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final m()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 2
    .line 3
    invoke-interface {p0}, Lci0;->m()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public final read([BII)I
    .locals 0

    .line 1
    iget-object p0, p0, Lp04;->n:Lci0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lwh0;->read([BII)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
