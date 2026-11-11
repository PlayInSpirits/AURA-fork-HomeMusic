.class public final Lhi0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Landroid/net/Uri;

.field public b:J

.field public c:I

.field public d:[B

.field public e:Ljava/util/Map;

.field public f:J

.field public g:J

.field public h:Ljava/lang/String;

.field public i:I


# virtual methods
.method public final a()Lii0;
    .locals 15

    .line 1
    iget-object v0, p0, Lhi0;->a:Landroid/net/Uri;

    .line 2
    .line 3
    const-string v1, "The uri must be set."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lii0;

    .line 9
    .line 10
    iget-object v3, p0, Lhi0;->a:Landroid/net/Uri;

    .line 11
    .line 12
    iget-wide v4, p0, Lhi0;->b:J

    .line 13
    .line 14
    iget v6, p0, Lhi0;->c:I

    .line 15
    .line 16
    iget-object v7, p0, Lhi0;->d:[B

    .line 17
    .line 18
    iget-object v8, p0, Lhi0;->e:Ljava/util/Map;

    .line 19
    .line 20
    iget-wide v9, p0, Lhi0;->f:J

    .line 21
    .line 22
    iget-wide v11, p0, Lhi0;->g:J

    .line 23
    .line 24
    iget-object v13, p0, Lhi0;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget v14, p0, Lhi0;->i:I

    .line 27
    .line 28
    invoke-direct/range {v2 .. v14}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    return-object v2
.end method
