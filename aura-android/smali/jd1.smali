.class public final Ljd1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lid1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final synthetic c:Lld1;


# direct methods
.method public constructor <init>(Lld1;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljd1;->c:Lld1;

    .line 5
    .line 6
    iput-object p2, p0, Ljd1;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Ljd1;->b:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Ljd1;->c:Lld1;

    .line 2
    .line 3
    iget-object v0, v0, Lld1;->y:Lkc1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, p0, Ljd1;->b:I

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Ljd1;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lkc1;->m()Lld1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, -0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Lld1;->R(II)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return v2

    .line 28
    :cond_0
    iget v7, p0, Ljd1;->b:I

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    iget-object v3, p0, Ljd1;->c:Lld1;

    .line 32
    .line 33
    iget-object v6, p0, Ljd1;->a:Ljava/lang/String;

    .line 34
    .line 35
    move-object v4, p1

    .line 36
    move-object v5, p2

    .line 37
    invoke-virtual/range {v3 .. v8}, Lld1;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method
