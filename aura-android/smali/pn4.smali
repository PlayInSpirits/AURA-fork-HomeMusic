.class public final Lpn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p:Lq45;


# instance fields
.field public final a:Lq45;

.field public final b:Lc12;

.field public c:Lgp3;

.field public d:Lgp3;

.field public e:Lxc5;

.field public f:Lrm3;

.field public g:Lhd5;

.field public h:Lxc5;

.field public i:Lgp3;

.field public j:Lwo0;

.field public k:Lrm3;

.field public l:Lrm3;

.field public m:Lxc5;

.field public n:Lwo0;

.field public o:Lxc5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq45;

    .line 2
    .line 3
    invoke-direct {v0}, Lq45;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpn4;->p:Lq45;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lc12;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lpn4;->p:Lq45;

    .line 5
    .line 6
    iput-object v0, p0, Lpn4;->a:Lq45;

    .line 7
    .line 8
    iput-object p1, p0, Lpn4;->b:Lc12;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Lxc5;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->h:Lxc5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxc5;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lxc5;-><init>(Lpn4;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lpn4;->h:Lxc5;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lpn4;->h:Lxc5;

    .line 14
    .line 15
    return-object p0
.end method

.method public final b()Lrm3;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->l:Lrm3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lrm3;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, p0, v1}, Lrm3;-><init>(Lpn4;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lpn4;->l:Lrm3;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lpn4;->l:Lrm3;

    .line 14
    .line 15
    return-object p0
.end method

.method public final c()Lgp3;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->d:Lgp3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lgp3;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, p0, v1}, Lgp3;-><init>(Lpn4;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lpn4;->d:Lgp3;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lpn4;->d:Lgp3;

    .line 14
    .line 15
    return-object p0
.end method

.method public final d()Lxc5;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->m:Lxc5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxc5;

    .line 6
    .line 7
    const/16 v1, 0xb

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lxc5;-><init>(Lpn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpn4;->m:Lxc5;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lpn4;->m:Lxc5;

    .line 15
    .line 16
    return-object p0
.end method

.method public final e()Lgp3;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->i:Lgp3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lgp3;

    .line 6
    .line 7
    const/16 v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lgp3;-><init>(Lpn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpn4;->i:Lgp3;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lpn4;->i:Lgp3;

    .line 15
    .line 16
    return-object p0
.end method

.method public final f()Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lpn4;->b:Lc12;

    .line 7
    .line 8
    iget-object v2, v1, Lc12;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/String;

    .line 11
    .line 12
    const-string v3, "u"

    .line 13
    .line 14
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Lc12;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Li61;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v2, v1, Li61;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const-string v3, "p"

    .line 30
    .line 31
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v2, v1, Li61;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const-string v3, "s"

    .line 41
    .line 42
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v1, v1, Li61;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    const-string v2, "t"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object p0, p0, Lpn4;->a:Lq45;

    .line 57
    .line 58
    iget-object p0, p0, Lq45;->n:Ljava/lang/String;

    .line 59
    .line 60
    const-string v1, "v"

    .line 61
    .line 62
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-string p0, "c"

    .line 66
    .line 67
    const-string v1, "Tempus"

    .line 68
    .line 69
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-string p0, "f"

    .line 73
    .line 74
    const-string v1, "json"

    .line 75
    .line 76
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final g()Lrm3;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->f:Lrm3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lrm3;

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lrm3;-><init>(Lpn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpn4;->f:Lrm3;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lpn4;->f:Lrm3;

    .line 15
    .line 16
    return-object p0
.end method

.method public final h()Lwo0;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->j:Lwo0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lwo0;

    .line 6
    .line 7
    const/16 v1, 0x12

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lwo0;-><init>(Lpn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpn4;->j:Lwo0;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lpn4;->j:Lwo0;

    .line 15
    .line 16
    return-object p0
.end method

.method public final i()Lwo0;
    .locals 2

    .line 1
    iget-object v0, p0, Lpn4;->n:Lwo0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lwo0;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lwo0;-><init>(Lpn4;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpn4;->n:Lwo0;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lpn4;->n:Lwo0;

    .line 15
    .line 16
    return-object p0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lpn4;->b:Lc12;

    .line 7
    .line 8
    iget-object p0, p0, Lc12;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, "/rest/"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "//rest"

    .line 25
    .line 26
    const-string v1, "/rest"

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
