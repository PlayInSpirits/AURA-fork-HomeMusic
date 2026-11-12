.class public final Ljw;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrj1;
.implements Lxx;
.implements Lretrofit2/Callback;


# static fields
.field public static final s:Lt71;

.field public static t:Z = true


# instance fields
.field public n:Z

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt71;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljw;->s:Lt71;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcn;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ljw;->o:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Ljw;->p:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, Ljw;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk51;Ltb1;Liu4;Lxn4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljw;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ljw;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ljw;->q:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Ljw;->r:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean p5, p0, Ljw;->n:Z

    .line 13
    .line 14
    return-void
.end method

.method public static o(Lwx;I)I
    .locals 4

    .line 1
    iget v0, p0, Lwx;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lwx;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    iget-object p0, p0, Lwx;->e:Lyj0;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-ge p1, v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lnd0;->a(Lnd0;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    mul-int/lit8 v1, v1, 0x1f

    .line 22
    .line 23
    const/16 v0, 0x20

    .line 24
    .line 25
    ushr-long v2, p0, v0

    .line 26
    .line 27
    xor-long/2addr p0, v2

    .line 28
    long-to-int p0, p0

    .line 29
    add-int/2addr v1, p0

    .line 30
    return v1

    .line 31
    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    .line 32
    .line 33
    invoke-virtual {p0}, Lyj0;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v1

    .line 38
    return p0
.end method

.method public static t(ILjava/io/DataInputStream;)Lwx;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-ge p0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    new-instance v2, Lxc5;

    .line 17
    .line 18
    const/4 v3, 0x5

    .line 19
    invoke-direct {v2, v3}, Lxc5;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v3, "exo_len"

    .line 23
    .line 24
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v2, p0, v3}, Lxc5;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lyj0;->c:Lyj0;

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Lyj0;->b(Lxc5;)Lyj0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {p1}, Lml3;->f(Ljava/io/DataInputStream;)Lyj0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_0
    new-instance p1, Lwx;

    .line 43
    .line 44
    invoke-direct {p1, v0, v1, p0}, Lwx;-><init>(ILjava/lang/String;Lyj0;)V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljw;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lhx;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Ljw;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    :try_start_1
    iput-boolean v1, p0, Ljw;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    iget-object v0, p0, Ljw;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lof4;

    .line 19
    .line 20
    invoke-static {v0}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 21
    .line 22
    .line 23
    :try_start_2
    iget-object p0, p0, Ljw;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lll;

    .line 26
    .line 27
    invoke-virtual {p0}, Lll;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0

    .line 33
    throw p0
.end method

.method public b(Ljava/util/HashMap;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ljw;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgp3;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lgp3;->y()Lel;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, p0, Ljw;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lz14;

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    new-instance v3, Lz14;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 19
    .line 20
    .line 21
    iput-object v3, p0, Ljw;->r:Ljava/lang/Object;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-virtual {v3, v2}, Lz14;->b(Ljava/io/OutputStream;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, p0, Ljw;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lz14;

    .line 32
    .line 33
    new-instance v3, Ljava/io/DataOutputStream;

    .line 34
    .line 35
    invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v3, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    move v4, v2

    .line 62
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Lwx;

    .line 73
    .line 74
    iget v6, v5, Lwx;->a:I

    .line 75
    .line 76
    invoke-virtual {v3, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    iget-object v6, v5, Lwx;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v3, v6}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v6, v5, Lwx;->e:Lyj0;

    .line 85
    .line 86
    invoke-static {v6, v3}, Lml3;->g(Lyj0;Ljava/io/DataOutputStream;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v1}, Ljw;->o(Lwx;I)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    add-int/2addr v4, v5

    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    move-exception p0

    .line 96
    move-object v1, v3

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 102
    .line 103
    .line 104
    iget-object p1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, Ljava/io/File;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    .line 111
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 112
    .line 113
    iput-boolean v2, p0, Ljw;->n:Z

    .line 114
    .line 115
    return-void

    .line 116
    :goto_2
    invoke-static {v1}, Lf35;->h(Ljava/io/Closeable;)V

    .line 117
    .line 118
    .line 119
    throw p0
.end method

.method public c(Lwx;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ljw;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method public d(Le93;)V
    .locals 2

    .line 1
    sget-object v0, Ldr4;->a:Lvc5;

    .line 2
    .line 3
    new-instance v1, Lhk5;

    .line 4
    .line 5
    invoke-direct {v1, v0, p1}, Lhk5;-><init>(Ljava/util/concurrent/Executor;Le93;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ljw;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lmf4;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lmf4;->i(Lhk5;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljw;->v()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(Lwx;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ljw;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ljw;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgp3;

    .line 4
    .line 5
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public g(Ljava/util/HashMap;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljw;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljw;->b(Ljava/util/HashMap;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(Ljava/util/HashMap;Landroid/util/SparseArray;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Ljw;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljavax/crypto/Cipher;

    .line 11
    .line 12
    iget-object v2, p0, Ljw;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lgp3;

    .line 15
    .line 16
    iget-object v3, v2, Lgp3;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/io/File;

    .line 19
    .line 20
    iget-object v4, v2, Lgp3;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ljava/io/File;

    .line 23
    .line 24
    iget-object v2, v2, Lgp3;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 43
    :try_start_0
    new-instance v5, Ljava/io/BufferedInputStream;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    new-instance v6, Ljava/io/FileInputStream;

    .line 58
    .line 59
    invoke-direct {v6, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 63
    .line 64
    .line 65
    new-instance v6, Ljava/io/DataInputStream;

    .line 66
    .line 67
    invoke-direct {v6, v5}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v6}, Ljava/io/DataInputStream;->readInt()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ltz v3, :cond_4

    .line 75
    .line 76
    const/4 v7, 0x2

    .line 77
    if-le v3, v7, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v6}, Ljava/io/DataInputStream;->readInt()I

    .line 81
    .line 82
    .line 83
    move-result v8
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    and-int/2addr v8, v1

    .line 85
    if-eqz v8, :cond_6

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    :cond_4
    :goto_1
    invoke-static {v6}, Lf35;->h(Ljava/io/Closeable;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_5
    const/16 v8, 0x10

    .line 95
    .line 96
    :try_start_2
    new-array v8, v8, [B

    .line 97
    .line 98
    invoke-virtual {v6, v8}, Ljava/io/DataInputStream;->readFully([B)V

    .line 99
    .line 100
    .line 101
    new-instance v9, Ljavax/crypto/spec/IvParameterSpec;

    .line 102
    .line 103
    invoke-direct {v9, v8}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    .line 105
    .line 106
    :try_start_3
    iget-object p0, p0, Ljw;->p:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Ljavax/crypto/spec/SecretKeySpec;

    .line 109
    .line 110
    sget-object v8, Lf35;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v7, p0, v9}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_3
    .catch Ljava/security/InvalidKeyException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    .line 114
    .line 115
    :try_start_4
    new-instance p0, Ljava/io/DataInputStream;

    .line 116
    .line 117
    new-instance v7, Ljavax/crypto/CipherInputStream;

    .line 118
    .line 119
    invoke-direct {v7, v5, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0, v7}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :catchall_0
    move-exception p0

    .line 127
    move-object v3, v6

    .line 128
    goto :goto_7

    .line 129
    :catch_0
    move-object v3, v6

    .line 130
    goto :goto_8

    .line 131
    :catch_1
    move-exception p0

    .line 132
    goto :goto_2

    .line 133
    :catch_2
    move-exception p0

    .line 134
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    :cond_6
    move-object p0, v6

    .line 141
    :goto_3
    :try_start_5
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const/4 v5, 0x0

    .line 146
    move v6, v5

    .line 147
    move v7, v6

    .line 148
    :goto_4
    if-ge v6, v0, :cond_7

    .line 149
    .line 150
    invoke-static {v3, p0}, Ljw;->t(ILjava/io/DataInputStream;)Lwx;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    iget-object v9, v8, Lwx;->b:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p1, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    iget v10, v8, Lwx;->a:I

    .line 160
    .line 161
    invoke-virtual {p2, v10, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v8, v3}, Ljw;->o(Lwx;I)I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    add-int/2addr v7, v8

    .line 169
    add-int/lit8 v6, v6, 0x1

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_1
    move-exception p1

    .line 173
    move-object v3, p0

    .line 174
    move-object p0, p1

    .line 175
    goto :goto_7

    .line 176
    :catch_3
    move-object v3, p0

    .line 177
    goto :goto_8

    .line 178
    :cond_7
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 183
    .line 184
    .line 185
    move-result v3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 186
    const/4 v6, -0x1

    .line 187
    if-ne v3, v6, :cond_8

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_8
    move v1, v5

    .line 191
    :goto_5
    if-ne v0, v7, :cond_a

    .line 192
    .line 193
    if-nez v1, :cond_9

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    invoke-static {p0}, Lf35;->h(Ljava/io/Closeable;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_a
    :goto_6
    invoke-static {p0}, Lf35;->h(Ljava/io/Closeable;)V

    .line 201
    .line 202
    .line 203
    goto :goto_9

    .line 204
    :catchall_2
    move-exception p0

    .line 205
    :goto_7
    if-eqz v3, :cond_b

    .line 206
    .line 207
    invoke-static {v3}, Lf35;->h(Ljava/io/Closeable;)V

    .line 208
    .line 209
    .line 210
    :cond_b
    throw p0

    .line 211
    :catch_4
    :goto_8
    if-eqz v3, :cond_c

    .line 212
    .line 213
    invoke-static {v3}, Lf35;->h(Ljava/io/Closeable;)V

    .line 214
    .line 215
    .line 216
    :cond_c
    :goto_9
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object p0, p0, Ljw;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgp3;

    .line 4
    .line 5
    iget-object v0, p0, Lgp3;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lgp3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/io/File;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public k(Lcg0;)V
    .locals 2

    .line 1
    sget-object v0, Ldr4;->a:Lvc5;

    .line 2
    .line 3
    new-instance v1, Lhk5;

    .line 4
    .line 5
    invoke-direct {v1, v0, p1}, Lhk5;-><init>(Ljava/util/concurrent/Executor;Lcg0;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ljw;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lmf4;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lmf4;->i(Lhk5;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljw;->v()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public l()V
    .locals 7

    .line 1
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 5
    .line 6
    iget-object v0, p0, Ljw;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    iget-boolean v2, p0, Ljw;->n:Z

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Ldw3;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iput-object v2, p0, Ljw;->r:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p0, Ljw;->n:Z

    .line 24
    .line 25
    new-instance v3, Lnq4;

    .line 26
    .line 27
    invoke-direct {v3, v1}, Lnq4;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, Landroidx/viewpager2/widget/ViewPager2;->p:Lq80;

    .line 31
    .line 32
    iget-object v4, v4, Lq80;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v3, Lis1;

    .line 40
    .line 41
    invoke-direct {v3, v2, v0}, Lis1;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v1, Lcom/google/android/material/tabs/TabLayout;->a0:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    new-instance v2, Lce1;

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-direct {v2, v3, p0}, Lce1;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, p0, Ljw;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, Ldw3;

    .line 64
    .line 65
    iget-object v3, v3, Ldw3;->n:Lew3;

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljw;->r()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v5, 0x1

    .line 78
    const/4 v6, 0x1

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x1

    .line 81
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/tabs/TabLayout;->j(IFZZZ)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    const-string p0, "TabLayoutMediator attached before ViewPager2 has an adapter"

    .line 86
    .line 87
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    const-string p0, "TabLayoutMediator is already attached"

    .line 92
    .line 93
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public m()Lsj1;
    .locals 5

    .line 1
    iget-object v0, p0, Ljw;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ljw;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lra;

    .line 7
    .line 8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v3, 0x1d

    .line 11
    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lz9;->b(Lra;)J

    .line 15
    .line 16
    .line 17
    :cond_0
    if-lt v2, v3, :cond_1

    .line 18
    .line 19
    new-instance p0, Lzj1;

    .line 20
    .line 21
    invoke-direct {p0}, Lzj1;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    sget-boolean v1, Ljw;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :try_start_1
    new-instance v1, Lxj1;

    .line 32
    .line 33
    iget-object v2, p0, Ljw;->o:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lra;

    .line 36
    .line 37
    new-instance v3, Lnz;

    .line 38
    .line 39
    invoke-direct {v3}, Lnz;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lmz;

    .line 43
    .line 44
    invoke-direct {v4}, Lmz;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2, v3, v4}, Lxj1;-><init>(Lra;Lnz;Lmz;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    const/4 v1, 0x0

    .line 52
    :try_start_2
    sput-boolean v1, Ljw;->t:Z

    .line 53
    .line 54
    new-instance v1, Lbk1;

    .line 55
    .line 56
    iget-object v2, p0, Ljw;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lra;

    .line 59
    .line 60
    invoke-virtual {p0, v2}, Ljw;->q(Lra;)Lqv0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v1, p0}, Lbk1;-><init>(Lqv0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    new-instance v1, Lbk1;

    .line 69
    .line 70
    iget-object v2, p0, Ljw;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lra;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Ljw;->q(Lra;)Lqv0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v1, p0}, Lbk1;-><init>(Lqv0;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    move-object p0, v1

    .line 82
    :goto_1
    new-instance v1, Lsj1;

    .line 83
    .line 84
    invoke-direct {v1, p0}, Lsj1;-><init>(Luj1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    monitor-exit v0

    .line 88
    return-object v1

    .line 89
    :goto_2
    monitor-exit v0

    .line 90
    throw p0
.end method

.method public n()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ljw;->n:Z

    .line 5
    .line 6
    const-string v2, "Task is not yet complete"

    .line 7
    .line 8
    invoke-static {v2, v1}, Lji2;->o(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ljw;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Exception;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Ljw;->q:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p0, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    .line 24
    .line 25
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lk03;

    .line 4
    .line 5
    iget-boolean p2, p0, Ljw;->n:Z

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Ljw;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Lmm3;

    .line 12
    .line 13
    iget-object p0, p0, Ljw;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/Thread;

    .line 18
    .line 19
    new-instance v1, Lqo2;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v1, p2, p0, p1, v2}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    invoke-virtual {p1, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 5

    .line 1
    iget-object p1, p0, Ljw;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lmm3;

    .line 4
    .line 5
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lk03;

    .line 8
    .line 9
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;->getEntries()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    new-instance p0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Ljava/lang/Thread;

    .line 66
    .line 67
    new-instance v1, Lqo2;

    .line 68
    .line 69
    const/16 v2, 0xb

    .line 70
    .line 71
    invoke-direct {v1, p1, p2, v0, v2}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    const/16 v1, 0x46

    .line 110
    .line 111
    if-ne p2, v1, :cond_2

    .line 112
    .line 113
    iget-object p2, p0, Ljw;->p:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p2, Ljava/lang/String;

    .line 116
    .line 117
    iget-object p0, p0, Ljw;->q:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Ljava/lang/Runnable;

    .line 120
    .line 121
    new-instance v1, Ljava/lang/Thread;

    .line 122
    .line 123
    new-instance v3, Lqo2;

    .line 124
    .line 125
    const/16 v4, 0x9

    .line 126
    .line 127
    invoke-direct {v3, p1, p2, p0, v4}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    invoke-virtual {v0, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_3
    invoke-virtual {v0, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public p()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ljw;->n:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ljw;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Exception;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    return v2

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p0
.end method

.method public q(Lra;)Lqv0;
    .locals 3

    .line 1
    iget-object v0, p0, Ljw;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw65;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lw65;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 21
    .line 22
    .line 23
    const v0, 0x7f0a028a

    .line 24
    .line 25
    .line 26
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    invoke-virtual {p1, v1, v0}, Lra;->addView(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Ljw;->q:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    return-object v0
.end method

.method public r()V
    .locals 8

    .line 1
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->h()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ljw;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ldw3;

    .line 11
    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    invoke-virtual {v1}, Ldw3;->a()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x1

    .line 21
    if-ge v3, v1, :cond_4

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->g()Lkq4;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Ljw;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Lcn;

    .line 30
    .line 31
    iget v7, v6, Lcn;->n:I

    .line 32
    .line 33
    packed-switch v7, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    iget-object v6, v6, Lcn;->o:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v6, Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 39
    .line 40
    sget v7, Lcom/eddyizm/tempus/ui/login/LoginActivity;->R:I

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v4, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    if-eq v3, v4, :cond_1

    .line 48
    .line 49
    const/4 v4, 0x3

    .line 50
    if-eq v3, v4, :cond_0

    .line 51
    .line 52
    const-string v4, ""

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const v4, 0x7f130298

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const v4, 0x7f130299

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const v4, 0x7f130297

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const v4, 0x7f130296

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    :goto_1
    invoke-virtual {v5, v4}, Lkq4;->a(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :pswitch_0
    iget-object v4, v6, Lcn;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Llo1;

    .line 93
    .line 94
    iget-object v4, v4, Llo1;->A:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v5, v4}, Lkq4;->a(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    :goto_2
    invoke-virtual {v0, v5, v2}, Lcom/google/android/material/tabs/TabLayout;->a(Lkq4;Z)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    if-lez v1, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    sub-int/2addr v1, v4

    .line 118
    iget-object p0, p0, Ljw;->p:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 121
    .line 122
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eq p0, v1, :cond_5

    .line 135
    .line 136
    invoke-virtual {v0, p0}, Lcom/google/android/material/tabs/TabLayout;->f(I)Lkq4;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {v0, p0, v4}, Lcom/google/android/material/tabs/TabLayout;->i(Lkq4;Z)V

    .line 141
    .line 142
    .line 143
    :cond_5
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public s(Lrf2;Lra;Z)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ljw;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcm1;

    .line 6
    .line 7
    iget-object v2, v1, Ljw;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lfm1;

    .line 10
    .line 11
    iget-boolean v3, v1, Ljw;->n:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iput-boolean v3, v1, Ljw;->n:Z

    .line 19
    .line 20
    iget-object v5, v1, Ljw;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lpz1;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    invoke-virtual {v5, v6, v7}, Lpz1;->B(Lrf2;Lra;)Lgp3;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v5, Lgp3;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Lxe2;

    .line 35
    .line 36
    invoke-virtual {v6}, Lxe2;->h()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v4

    .line 41
    :goto_0
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Lxe2;->i(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Lon3;

    .line 48
    .line 49
    iget-boolean v10, v9, Lon3;->d:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v9, Lon3;->h:Z

    .line 54
    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    :goto_1
    move v7, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v7, v3

    .line 67
    :goto_2
    invoke-virtual {v6}, Lxe2;->h()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    move v9, v4

    .line 72
    :goto_3
    if-ge v9, v8, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v9}, Lxe2;->i(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Lon3;

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    invoke-static {v10}, Lgi1;->g(Lon3;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :cond_4
    iget-object v11, v1, Ljw;->o:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    check-cast v12, Lc72;

    .line 92
    .line 93
    iget-wide v13, v10, Lon3;->c:J

    .line 94
    .line 95
    iget-object v11, v1, Ljw;->r:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v11

    .line 98
    check-cast v15, Lfm1;

    .line 99
    .line 100
    iget v11, v10, Lon3;->i:I

    .line 101
    .line 102
    const/16 v17, 0x1

    .line 103
    .line 104
    move/from16 v16, v11

    .line 105
    .line 106
    invoke-virtual/range {v12 .. v17}, Lc72;->z(JLfm1;IZ)V

    .line 107
    .line 108
    .line 109
    iget-object v11, v2, Lfm1;->n:Lq03;

    .line 110
    .line 111
    invoke-virtual {v11}, Lq03;->h()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_5

    .line 116
    .line 117
    iget-wide v11, v10, Lon3;->a:J

    .line 118
    .line 119
    invoke-static {v10}, Lgi1;->g(Lon3;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v0, v11, v12, v2, v10}, Lcm1;->a(JLjava/util/List;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lfm1;->clear()V

    .line 127
    .line 128
    .line 129
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move/from16 v2, p3

    .line 133
    .line 134
    invoke-virtual {v0, v5, v2}, Lcm1;->b(Lgp3;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {v6}, Lxe2;->h()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    move v5, v4

    .line 143
    :goto_4
    if-ge v5, v2, :cond_8

    .line 144
    .line 145
    invoke-virtual {v6, v5}, Lxe2;->i(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Lon3;

    .line 150
    .line 151
    invoke-static {v7, v3}, Lgi1;->S(Lon3;Z)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    const-wide/16 v10, 0x0

    .line 156
    .line 157
    invoke-static {v8, v9, v10, v11}, Lg83;->b(JJ)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-nez v8, :cond_7

    .line 162
    .line 163
    invoke-virtual {v7}, Lon3;->c()Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    move v2, v3

    .line 170
    goto :goto_5

    .line 171
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_8
    move v2, v4

    .line 175
    :goto_5
    invoke-virtual {v6}, Lxe2;->h()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    move v7, v4

    .line 180
    :goto_6
    if-ge v7, v5, :cond_a

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Lxe2;->i(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    check-cast v8, Lon3;

    .line 187
    .line 188
    invoke-virtual {v8}, Lon3;->c()Z

    .line 189
    .line 190
    .line 191
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    if-eqz v8, :cond_9

    .line 193
    .line 194
    move v5, v3

    .line 195
    goto :goto_7

    .line 196
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_a
    move v5, v4

    .line 200
    :goto_7
    shl-int/2addr v2, v3

    .line 201
    or-int/2addr v0, v2

    .line 202
    shl-int/lit8 v2, v5, 0x2

    .line 203
    .line 204
    or-int/2addr v0, v2

    .line 205
    iput-boolean v4, v1, Ljw;->n:Z

    .line 206
    .line 207
    return v0

    .line 208
    :goto_8
    iput-boolean v4, v1, Ljw;->n:Z

    .line 209
    .line 210
    throw v0
.end method

.method public u()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ljw;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Ljw;->n:Z

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_1
    iget-object v1, p0, Ljw;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Exception;

    .line 19
    .line 20
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljw;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljw;->n()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "result "

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const-string p0, "unknown issue"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string p0, "failure"

    .line 48
    .line 49
    :goto_0
    const-string v0, "Complete with: "

    .line 50
    .line 51
    new-instance v2, Lcom/google/android/gms/tasks/DuplicateTaskCompletionException;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v2, p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p0

    .line 64
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p0, "DuplicateTaskCompletionException can only be created from completed Task."

    .line 67
    .line 68
    invoke-direct {v2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    throw v2

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 74
    throw p0

    .line 75
    :cond_3
    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljw;->o:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ljw;->n:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Ljw;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lmf4;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lmf4;->j(Ljw;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p0
.end method
