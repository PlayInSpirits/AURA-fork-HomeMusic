.class public final Lretrofit2/Retrofit$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/Retrofit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private baseUrl:Ldefpackage/gr1;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final callAdapterFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit2/CallAdapter$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private callFactory:Ldefpackage/fy;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private callbackExecutor:Ljava/util/concurrent/Executor;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final converterFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit2/Converter$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private validateEagerly:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lretrofit2/Retrofit;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    .line 17
    .line 18
    iget-object v0, p1, Lretrofit2/Retrofit;->callFactory:Ldefpackage/fy;

    .line 19
    .line 20
    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callFactory:Ldefpackage/fy;

    .line 21
    .line 22
    iget-object v0, p1, Lretrofit2/Retrofit;->baseUrl:Ldefpackage/gr1;

    .line 23
    .line 24
    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Ldefpackage/gr1;

    .line 25
    .line 26
    iget-object v0, p1, Lretrofit2/Retrofit;->converterFactories:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p1, Lretrofit2/Retrofit;->defaultConverterFactoriesSize:I

    .line 33
    .line 34
    sub-int/2addr v0, v1

    .line 35
    const/4 v1, 0x1

    .line 36
    :goto_0
    if-ge v1, v0, :cond_0

    .line 37
    .line 38
    iget-object v2, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 39
    .line 40
    iget-object v3, p1, Lretrofit2/Retrofit;->converterFactories:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lretrofit2/Converter$Factory;

    .line 47
    .line 48
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p1, Lretrofit2/Retrofit;->callAdapterFactories:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v1, p1, Lretrofit2/Retrofit;->defaultCallAdapterFactoriesSize:I

    .line 61
    .line 62
    sub-int/2addr v0, v1

    .line 63
    const/4 v1, 0x0

    .line 64
    :goto_1
    if-ge v1, v0, :cond_1

    .line 65
    .line 66
    iget-object v2, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    .line 67
    .line 68
    iget-object v3, p1, Lretrofit2/Retrofit;->callAdapterFactories:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lretrofit2/CallAdapter$Factory;

    .line 75
    .line 76
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object v0, p1, Lretrofit2/Retrofit;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 83
    .line 84
    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 85
    .line 86
    iget-boolean p1, p1, Lretrofit2/Retrofit;->validateEagerly:Z

    .line 87
    .line 88
    iput-boolean p1, p0, Lretrofit2/Retrofit$Builder;->validateEagerly:Z

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public addCallAdapterFactory(Lretrofit2/CallAdapter$Factory;)Lretrofit2/Retrofit$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "factory == null"

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "factory == null"

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public baseUrl(Ldefpackage/gr1;)Lretrofit2/Retrofit$Builder;
    .locals 2

    .line 1
    const-string v0, "baseUrl == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Ldefpackage/gr1;->f:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, -0x1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Ldefpackage/gr1;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const-string p0, "baseUrl must end in /: "

    .line 30
    .line 31
    invoke-static {p1, p0}, Ldefpackage/mj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;
    .locals 2

    .line 36
    const-string v0, "baseUrl == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    new-instance v0, Ldefpackage/fr1;

    invoke-direct {v0}, Ldefpackage/fr1;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lretrofit2/Retrofit$Builder;->baseUrl(Ldefpackage/gr1;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    return-object p0
.end method

.method public baseUrl(Ljava/net/URL;)Lretrofit2/Retrofit$Builder;
    .locals 2

    .line 39
    const-string v0, "baseUrl == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    new-instance v0, Ldefpackage/fr1;

    invoke-direct {v0}, Ldefpackage/fr1;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Lretrofit2/Retrofit$Builder;->baseUrl(Ldefpackage/gr1;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    return-object p0
.end method

.method public build()Lretrofit2/Retrofit;
    .locals 11

    .line 1
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Ldefpackage/gr1;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->callFactory:Ldefpackage/fy;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ldefpackage/o83;

    .line 10
    .line 11
    new-instance v1, Ldefpackage/n83;

    .line 12
    .line 13
    invoke-direct {v1}, Ldefpackage/n83;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    move-object v3, v0

    .line 20
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lretrofit2/Platform;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    :cond_1
    move-object v9, v0

    .line 27
    sget-object v0, Lretrofit2/Platform;->builtInFactories:Lretrofit2/BuiltInFactories;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    iget-object v2, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v9}, Lretrofit2/BuiltInFactories;->createDefaultCallAdapterFactories(Ljava/util/concurrent/Executor;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lretrofit2/BuiltInFactories;->createDefaultConverterFactories()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    iget-object v5, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    add-int/2addr v5, v6

    .line 62
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Lretrofit2/BuiltInConverters;

    .line 66
    .line 67
    invoke-direct {v5}, Lretrofit2/BuiltInConverters;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v5, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    move-object v0, v2

    .line 82
    new-instance v2, Lretrofit2/Retrofit;

    .line 83
    .line 84
    move-object v5, v4

    .line 85
    iget-object v4, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Ldefpackage/gr1;

    .line 86
    .line 87
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    iget-boolean v10, p0, Lretrofit2/Retrofit$Builder;->validateEagerly:Z

    .line 100
    .line 101
    invoke-direct/range {v2 .. v10}, Lretrofit2/Retrofit;-><init>(Ldefpackage/fy;Ldefpackage/gr1;Ljava/util/List;ILjava/util/List;ILjava/util/concurrent/Executor;Z)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_2
    const-string p0, "Base URL required."

    .line 106
    .line 107
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public callAdapterFactories()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lretrofit2/CallAdapter$Factory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/Retrofit$Builder;->callAdapterFactories:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public callFactory(Ldefpackage/fy;)Lretrofit2/Retrofit$Builder;
    .locals 1

    .line 1
    const-string v0, "factory == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/fy;

    .line 7
    .line 8
    iput-object p1, p0, Lretrofit2/Retrofit$Builder;->callFactory:Ldefpackage/fy;

    .line 9
    .line 10
    return-object p0
.end method

.method public callbackExecutor(Ljava/util/concurrent/Executor;)Lretrofit2/Retrofit$Builder;
    .locals 1

    .line 1
    const-string v0, "executor == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p1, p0, Lretrofit2/Retrofit$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    return-object p0
.end method

.method public client(Ldefpackage/o83;)Lretrofit2/Retrofit$Builder;
    .locals 1

    .line 1
    const-string v0, "client == null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/fy;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lretrofit2/Retrofit$Builder;->callFactory(Ldefpackage/fy;)Lretrofit2/Retrofit$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public converterFactories()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lretrofit2/Converter$Factory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public validateEagerly(Z)Lretrofit2/Retrofit$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lretrofit2/Retrofit$Builder;->validateEagerly:Z

    .line 2
    .line 3
    return-object p0
.end method
