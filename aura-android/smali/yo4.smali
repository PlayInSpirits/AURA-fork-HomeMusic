.class public final Lyo4;
.super Lzo4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Ldf1;


# direct methods
.method public constructor <init>(Lwe1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lzo4;-><init>(Lwe1;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lwe1;->j(Ljava/lang/String;)Ldf1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lyo4;->q:Ldf1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final D(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh12;->P(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final O()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyo4;->q:Ldf1;

    .line 5
    .line 6
    iget-object p0, p0, Ldf1;->o:Landroid/database/sqlite/SQLiteStatement;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final c(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyo4;->q:Ldf1;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2, p3}, Lvo4;->c(IJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyo4;->q:Ldf1;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lzo4;->p:Z

    .line 8
    .line 9
    return-void
.end method

.method public final d(DI)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyo4;->q:Ldf1;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2, p3}, Lvo4;->d(DI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyo4;->q:Ldf1;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lvo4;->e(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final getColumnCount()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh12;->P(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final getDouble(I)D
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh12;->P(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final getLong(I)J
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh12;->P(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final isNull(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzo4;->b()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x15

    .line 5
    .line 6
    const-string p1, "no row"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh12;->P(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final r(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzo4;->b()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lyo4;->q:Ldf1;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2}, Lvo4;->h(ILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final reset()V
    .locals 0

    .line 1
    return-void
.end method
